//package java_book;
//
//import java.lang.reflect.*;
//
//public class Ex41 {
//	public static void main(String[] args) {
//		try {
//			Class clazz = Class.forName("java_book.TClass");
//
//			System.out.println("[Class Name]");
//			System.out.println(clazz.getName());
//			System.out.println();
//
//			System.out.println("[Constructor Info]");
//			Constructor[] constructors = clazz.getDeclaredConstructors();
//			for (Constructor constructor : constructors) {
//				System.out.print(constructor.getName() + "(");
//				Class[] parameters = constructor.getParameterTypes();
//				printParameters(parameters);
//				System.out.println(")");
//			}
//
//			System.out.println();
//			System.out.println("[Field Info]");
//			Field[] fields = clazz.getDeclaredFields();
//			for (Field field : fields) {
//				System.out.println(field.getType().getSimpleName() + " " + field.getName());
//			}
//			System.out.println();
//
//			System.out.println("[Method Info]");
//			Method[] methods = clazz.getDeclaredMethods();
//			for (Method method : methods) {
//				System.out.print(method.getName() + "(");
//				Class[] parameters = method.getParameterTypes();
//				printParameters(parameters);
//				System.out.println(")");
//			}
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
//
//	private static void printParameters(Class[] parameters) {
//		for (int i = 0; i < parameters.length; i++) {
//			System.out.print(parameters[i].getName());
//			if (i < parameters.length - 1) {
//				System.out.print(", ");
//			}
//		}
//	}
//}
//
//class TClass {
//	
//	private double mSpeed;
//	private int mColor;
//
//	public TClass() {
//	}
//
//	public TClass(int a, int b) {
//	}
//
//	public double getSpeed() {
//		return mSpeed;
//	}
//
//	public int getColor() {
//		return mColor;
//	}
//
//	public void setColor(int color) {
//		mColor = color;
//	}
//}