package tr.dvdrental.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tr.dvdrental.model.Language;
import tr.dvdrental.model.Language;
import tr.dvdrental.util.DBUtil;

public class LanguageService implements ServiceI<Language>{


	private DBUtil dbUtil;

	public LanguageService() {

		this.dbUtil = new DBUtil();

	}

	public Language add(Language t) {

		/**
		 * Statement PrepareStatemet =>> parametre
		 * 
		 */

		String sql = "INSERT INTO Language(name) VALUES (?)";

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

			ResultSet set = dbUtil.getResult("Select * from Language where Language_id=" + id);

			while (set.next()) {
				t.setId(set.getInt("Language_id"));
				t.setLastUpdate(set.getDate("last_update"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return t;
	}

	public Language update(Language t) {

		String sql = "UPDATE Language " + "SET  name='" + t.getName() + "' WHERE Language_id=" + t.getId();

		try {
			dbUtil.connection.createStatement().executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return t;
	}

	public List<Language> getList() {

		List<Language> liste = new ArrayList<Language>();

		ResultSet set = dbUtil.getResult("SELECT * FROM Language");

		try {

			while (set.next()) {
				Language Language = new Language();
				Language.setId(set.getInt("Language_id"));
				Language.setName(set.getString("name"));
				Language.setLastUpdate(set.getDate("last_update"));

				liste.add(Language);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return liste;
	}

	public void delete(Language t) {

		String sql = "DELETE FROM Language where Language_id=" + t.getId();
		try {

			dbUtil.connection.createStatement().executeUpdate(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Language getModel(int id) {

		String sql = "Select * from Language where Language_id=" + id;
		Language Language = null;

		try {

			ResultSet set = dbUtil.connection.createStatement().executeQuery(sql);

			if (set != null && set.next()) {
				Language = new Language(set.getInt("Language_id"), set.getString("name"), set.getDate("last_update"));

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

		return Language;
	}

	
	

}
