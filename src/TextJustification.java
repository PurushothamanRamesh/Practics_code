import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public static void main(String[] args) {
        String[] arr={"This", "is", "an", "example", "of", "text", "justification."};
        int maxwight=16;
        List<String > ans=fullJustify(arr,maxwight);
        for (String answer :ans){
            System.out.println(answer);
        }
    }
    public static List<String > answer(String[] words, int weightoflength){
        List<String > result=new ArrayList<>();
        int index=0;
        while (index<words.length){
            int count=words[index].length();
            int last=index+1;
            while (last< words.length){
                if (words[last].length()+count+1>weightoflength) break;
                count+=words[last].length()+1;
                last++;
            }
            int diff=last-index-1;
            StringBuilder value=new StringBuilder();
            if (last==words.length){
                for (int i=index;i<last;i++){
                    value.append(words[i]+" ");
                }
                value.deleteCharAt(value.length()-1);
                for (int i=value.length();i<weightoflength;i++){
                    value.append(" ");
                }
            }else {
                int space=(weightoflength-count)/diff;
                int remainingspace=(weightoflength-count)%diff;
                for (int i=index;i<last;i++){
                    value.append(words[i]);
                    if (i<last-1){
                        for (int j=0;j<=(space+(i-index)<remainingspace?1:0);j++){
                            value.append(" ");
                        }
                    }
                }
            }
            result.add(value.toString());
            index=last;
        }
        return result;
    }

    public static List<String> fullJustify(String[] words, int weightoflength) {
        List<String> lines = new ArrayList<String>();

        int index = 0;
        while (index < words.length) {
            int count = words[index].length();
            int last = index + 1;
            while (last < words.length) {
                if (words[last].length() + count + 1 > weightoflength) break;
                count += words[last].length() + 1;
                last++;
            }

            StringBuilder builder = new StringBuilder();
            int diff = last - index - 1;
            // if last line or number of words in the line is 1, left-justified
            if (last == words.length || diff == 0) {
                 for (int i = index; i < last; i++) {
                    builder.append(words[i] + " ");
                }
                builder.deleteCharAt(builder.length() - 1);
                for (int i = builder.length(); i < weightoflength; i++) {
                    builder.append(" ");
                }
            } else {
                // middle justified
                int spaces = (weightoflength - count) / diff;
                int r = (weightoflength - count) % diff;
                for (int i = index; i < last; i++) {
                    builder.append(words[i]);
                    if (i < last - 1) {
                        for (int j = 0; j <= (spaces + ((i - index) < r ? 1 : 0)); j++) {
                            builder.append(" ");
                        }
                    }
                }
            }
            lines.add(builder.toString());
            index = last;
        }


        return lines;
    }
}