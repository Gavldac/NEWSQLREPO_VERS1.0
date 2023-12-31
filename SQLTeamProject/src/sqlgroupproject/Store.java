package sqlgroupproject;

public class Store {
	public static final String createTable =
			"CREATE TABLE Store ("
			+ "Id int,"
			+ "City varchar(255),"
			+ "Pharmacy int,"
			+ "Zipcode int"
			+ ")";
	
	public static final String insertData =
			"INSERT INTO Store (Id, City, Pharmacy, Zipcode) VALUES "
			+ "(1000,'Taylorsville', 0, 84045),"
			+ "(1001,'Detroit', 1, 48127),"
			+ "(1002,'Arlington', 0, 76001)";
	
	public static final String selectAll =
			"SELECT * FROM Store";
	
	public static final String dropTable =
			"DROP TABLE Store";


/**
 * method to add a new store to the Stores database.
 * 
 * @param storeID - the manually entered ID number of the new store
 * @param city - the name of the city of the new store
 * @param pharmacy - pharmacy is either a 0 or 1 for determining if the store has a pharmacy (0 means no pharm)
 * @param zip - the zip code for the new store
 * 
 * 
 * @author Edwin
 */
	public static void newStore(int storeID, String city, int pharmacy, int zip) {
		try {
			Connection connection = DriverManager.getConnection(databaseURL);
			PreparedStatement prep = connection.prepareStatement(Store.insertData);
			prep.setInt(1, storeID);
			prep.setString(2, city);
			prep.setInt(3, pharmacy);
			prep.setInt(4, zip);

			int success = prep.executeUpdate();

			if (succeess > 0)
				System.out.println("New Store added! ");
			else
				System.out.println("Bad or incomplete data. Please retry adding new Store.");

			prep.close();
			connection.close();

		} catch (SQLException e) {
			System.out.println("There was a problem adding a new store to the Store Database.");
		}
	}
	
	p
	
}