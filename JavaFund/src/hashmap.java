import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashmap {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		HashMap<Integer, String>h=new HashMap<Integer, String>();
//		h.put(1, "minaz");
//		h.put(2, "a");
//		h.put(3, "khan");
//System.out.println(h);
//Set s=h.entrySet();
//Iterator it=s.iterator();
//while(it.hasNext()){
//	Map.Entry mp=(Entry) it.next();
//	System.out.println(mp.getKey());
//	System.out.println(mp.getValue());
//}
		HashMap<Integer, String> hm= new HashMap<Integer,String>();
		hm.put(1, "minaz");
		hm.put(2, "khan");
		Set s=hm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()){
			Map.Entry mp=(Entry) i.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}






    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
    
  }

}