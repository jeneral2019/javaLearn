package base.file;

public class BufferedReader_ extends Reader_{

    Reader_ reader_;

    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }

    public void readFiles(int n){
        for (int i = 0; i <n ; i++) {
            reader_.readFile();
        }

    }

    @Override
    public void readFile() {
        reader_.readFile();
    }
}
