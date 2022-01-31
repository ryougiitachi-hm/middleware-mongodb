package per.itachi.middleware.mongodb.driver;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import lombok.extern.slf4j.Slf4j;
import org.bson.Document;

@Slf4j
public class MongoClientEntry {

    public static void main(String[] args) {
        String username = args[0];
        String password = args[1];
        String hosts = args[2];
        String databaseName = args[3];
        String collectionName = args[4];
        String fieldName = args[5];
        String fieldValue = args[6];

        String uri = String.format("mongodb://%s", hosts);
        try(MongoClient client = MongoClients.create(uri)) {
            MongoDatabase database = client.getDatabase(databaseName);
            MongoCollection<Document> collection = database.getCollection(collectionName);
            Document document = collection.find(Filters.eq(fieldName, fieldValue)).first();
            log.info("The criteria: field={}, value={}, document={}. ",
                    fieldName, fieldValue, document);
        }
    }
}
