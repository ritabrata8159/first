import java.util.ArrayList;
class instructor
{
	String name;
	String ph;
	void setdata(String name,String ph)
	{
		this.name=name;
		this.ph=ph;
	}
	void show()
	{
		System.out.println("Name      :"+name);
		System.out.println("ph no     :"+ph);
	}
}
class textbook
{
	String name;
	String author;
	String publisher;
	void setdata(String name,String author,String publisher)
	{
		this.name=name;
		this.author=author;
		this.publisher=publisher;
	}
	void show()
	{
		System.out.println("Name      :"+name);
		System.out.println("author    :"+author);
		System.out.println("publisher :"+publisher);
	}
}
class course
{
	String name;
	void setdata(String name)
	{
		this.name=name;
	}
	void show()
	{
		System.out.println("Name      :"+name);
	}
}
class programme
{
	ArrayList<course> course_list;
	ArrayList<textbook> textbook_list;
	ArrayList<instructor> instructor_list;
	programme()
	{
	    course_list=new ArrayList<course>();
	    textbook_list=new ArrayList<textbook>();
	    instructor_list=new ArrayList<instructor>();
	}
}
public class Q10
{

	public static void main(String args[])
	{
	    programme BCSE=new programme();
	    course c=new course();
	    c.setdata("OOP with java");
	    textbook t=new textbook();
	    t.setdata("Java","Balaguruswamy","Balaji");
	    instructor i=new instructor();
	    i.setdata("SKS","8798652145");
	
	    
	    
		BCSE.course_list.add(c);
		BCSE.textbook_list.add(t);
		BCSE.instructor_list.add(i);
		
		BCSE.course_list.get(0).show();
		BCSE.textbook_list.get(0).show();
		BCSE.instructor_list.get(0).show();
				
	}
}
