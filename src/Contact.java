import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
public class Contact {
	
	private ArrayList<String> numbers;
	private Map<String, NumberType> typeMap;
	
	public Contact(ArrayList<String> nums, Map<String, NumberType> types)
	{
		numbers=nums;
		typeMap=types;
	}
	
	public ArrayList<String> getNumbers()
	{
		return numbers;
	}
	
	public Map<String, NumberType> getTypeMap()
	{
		return typeMap;
	}
	
}
