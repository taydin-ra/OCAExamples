package OcaPrep;
interface Downloadable{

    public void download();
}
public interface Readable extends Downloadable {

    public void readBook();


    }

    abstract class Book implements Readable{
public Book(){

}
        @Override
        public void readBook() {

        }
    }

class Ebook extends Book{

    @Override
    public void readBook() {
        super.readBook();
    }


    @Override
    public void download() {

    }
}
