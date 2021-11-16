import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
	String s();
	int val();
}


class Meta {

	@MyAnno(s = "Annotation", val = 100)
	public static void myMethod(){

		Meta ob = new Meta();

		try{
			Class<?> c = ob.getClass();

			Method m = c.getMethod("myMethod");

			MyAnno anno = m.getAnnotation(MyAnno.class);

			System.out.println(anno.s() + " " + anno.val());
		}catch(NoSuchMethodException e){
			System.out.println("method not found");
		}
	}

	public static void main(String[] args) {
		myMethod();
	}
}