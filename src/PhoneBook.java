import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class PhoneBook {
	
	private ArrayList<String> names;
	private Map<String, ArrayList<Contact>> entries;
	
	public PhoneBook()
	{
		names=new ArrayList<String>();
		entries=new HashMap<String, ArrayList<Contact>>();
	}
	
	public void addToPhoneBook(String name, Contact entry)
	{
		if(!names.contains(name))
		{
			names.add(name);
			
			//used Stack Overflow for example of sort method:
			//https://stackoverflow.com/questions/16252269/how-to-sort-a-list-arraylist
			Collections.sort(names);
			
			entries.put(name, new ArrayList<Contact>());
		}

		entries.get(name).add(entry);
	}
	
	public ArrayList<String> getNames(String number)
	{
		return names;
	}
	
	public ArrayList<String> getNumbers(String name)
	{
		ArrayList<String> numbers=new ArrayList<String>();
		ArrayList<Contact> temp;
		for(String n : names)
		{
			temp=entries.get(n);
			int i=0;
			for(Contact c : temp)
			{
				numbers.add(c.getNumbers().get(i));
				i++;
			}
		}
		
		//used Stack Overflow for example of sort method:
		//https://stackoverflow.com/questions/16252269/how-to-sort-a-list-arraylist
		Collections.sort(numbers);
		
		return numbers;
	}
	

}
