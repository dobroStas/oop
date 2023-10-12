package seminar3_4;

import java.util.Comparator;
public class StreamComporator implements Comparator<Stream> {
    
    @Override
    public int compare(Stream o1, Stream o2) {
        return Integer.compare(o1.getNumberOfGroups(), o2.getNumberOfGroups());
    }
}