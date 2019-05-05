package tr.dvdrental.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import tr.dvdrental.model.Category;
import tr.dvdrental.util.DBUtil;

public class CategoryService implements ServiceI<Category> {

	private DBUtil dbUtil;

	public CategoryService() {

		this.dbUtil = new DBUtil();

	}

	public Category add(Category t) {

		/**
		 * Statement PrepareStatemet =>> parametre
		 * 
		 */

		String sql = "INSERT INTO category(name) VALUES (?)";

		dbUtil.connect();

		try {

			PreparedStatement preparedStatement = dbUtil.connection.prepareStatement(sql,
					Statement.RETURN_GENERATED_KEYS);

			preparedStatement.setString(1, t.getName());

			preparedStatement.executeUpdate(); // return 1 => tabloyu kaydı
												// gectim 0=> bir problem

			ResultSet idSet = preparedStatement.getGeneratedKeys();
			int id = 0;
			if (idSet.next())
				id = idSet.getInt(1);

			ResultSet set = dbUtil.getResult("Select * from category where category_id=" + id);

			while (set.next()) {
				t.setId(set.getInt("category_id"));
				t.setLastUpdate(set.getDate("last_update"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return t;
	}

	public Category update(Category t) {

		String sql = "UPDATE category " + "SET  name='" + t.getName() + "' WHERE category_id=" + t.getId();

		try {
			dbUtil.connection.createStatement().executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return t;
	}

	public List<Category> getList() {

		List<Category> liste = new ArrayList<Category>();

		ResultSet set = dbUtil.getResult("SELECT * FROM category");

		try {

			while (set.next()) {
				Category category = new Category();
				category.setId(set.getInt("category_id"));
				category.setName(set.getString("name"));
				category.setLastUpdate(set.getDate("last_update"));

				liste.add(category);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return liste;
	}

	public void delete(Category t) {

		String sql = "DELETE FROM category where category_id=" + t.getId();
		try {

			dbUtil.connection.createStatement().executeUpdate(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Category getModel(int id) {

		String sql = "Select * from category where category_id=" + id;
		Category category = null;

		try {

			ResultSet set = dbUtil.connection.createStatement().executeQuery(sql);

			if (set != null && set.next()) {
				category = new Category(set.getInt("category_id"), set.getString("name"), set.getDate("last_update"));

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

		return category;
	}

}
