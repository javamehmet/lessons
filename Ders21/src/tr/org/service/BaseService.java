package tr.org.service;

import java.util.Scanner;

public interface BaseService<T> {
	
	public static Scanner scanner=new Scanner(System.in);

	public T olustur();	
}
