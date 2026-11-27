package serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;

public class Serialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        MyFavoriteClass mfc = new MyFavoriteClass("john", "littleJohn");

        Path file = Path.of("./src", "serialization", "objects", "mfc.bin");

        // output object to binary
        ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(file));
        oos.writeObject(mfc);
        oos.close();

        // input object from binary
        ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(file));
        MyFavoriteClass mfc_is_back = (MyFavoriteClass) ois.readObject();
        ois.close();

        System.out.println(mfc_is_back);

    }

    // the class and used classes needs impl Serializable and
    public static class MyFavoriteClass implements Serializable {

        private final String myFavoriteName;

        // if we don't want to serializate some attribute, we can define this attribute as transient
        private transient final String myFavoritePassword;

        public MyFavoriteClass(String myFavoriteName, String myFavoritePassword) {
            this.myFavoriteName = myFavoriteName;
            this.myFavoritePassword = myFavoritePassword;
        }

        public String getMyFavoriteName() {
            return myFavoriteName;
        }

        public String getMyFavoritePassword() {
            return myFavoritePassword;
        }

        @Override
        public String toString() {
            return "MyFavoriteClass{" +
                    "myFavoriteName='" + myFavoriteName + '\'' +
                    ", myFavoritePassword='" + myFavoritePassword + '\'' +
                    '}';
        }
    }

}
