import java.util.List;
import java.util.Set;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;

public class JavaMongoDemo
{
	public static void main(String[] args)
	{
		try
		{
			// ---------- Connecting DataBase -------------------------//
			MongoClient mongoClient = new MongoClient("localhost", 27017);
			// ---------- Creating DataBase ---------------------------//
			/*MongoDatabase db = mongoClient.getDatabase("javatpoint");
			// ---------- Creating Collection -------------------------//
			MongoCollection<Document> table = db.getCollection("employee");
			// ---------- Creating Document ---------------------------//
			Document doc = new Document("name", "Peter John");
			doc.append("id", 12);
			// ----------- Inserting Data ------------------------------//
			table.insertOne(doc);*/
			List<String> listOfDatabases=mongoClient.getDatabaseNames();
			DB db = mongoClient.getDB("javatpoint");
Set<String> setOfCollections=db.getCollectionNames();
			System.out.println(setOfCollections);
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}