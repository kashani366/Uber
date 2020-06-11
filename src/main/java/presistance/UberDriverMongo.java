package presistance;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import model.UberDriver;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class UberDriverMongo implements UberDriverDao {
    MongoClient mongoClient;
    MongoDatabase database;
    MongoCollection<UberDriver> collection;

    public UberDriverMongo(){
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoClientSettings settings = MongoClientSettings.builder()
                .codecRegistry(pojoCodecRegistry)
                .build();
        mongoClient = MongoClients.create(settings);
        database = mongoClient.getDatabase("Uber");
        database = database.withCodecRegistry(pojoCodecRegistry);
        collection = database.getCollection("UberDriver", UberDriver.class);
    }

    @Override
    public void addDriver(UberDriver driver) {
        collection.insertOne(driver);
    }
}
