package nyc.c4q.Amcbri15;

/**
 * Created by c4q-anthony-mcbride on 3/10/15.
 */
public class CharLength {
    public static void main(String[] args){
        String quote = "We must include in any language with which we hope to describe complex data-processing situations the capability for describing data. We must also include a mechanism for determining the priorities to be applied to the data. These priorities are not fixed and are indicated in many cases by the data.\n" +
                "\n" +
                "\"Thus we must have a language and a structure that will take care of the data descriptions and priorities, as well as the operations we wish to perform. If we think seriously about these problems, we find that we cannot work with procedures alone, since they are sequential. We need to define the problem instead of the procedures. The Language Structures Group of the Codasyl Committee has been studying the structure of languages that can be used to describe data-processing problems. The Group started out by trying to design a language for stating procedures, but soon discovered that what was really required was a description of the data and a statement of the relationships between the data sets. The Group has since begun writing an algebra of processes, the background for a theory of data processing.\n" +
                "\n" +
                "\"Clearly, we must break away from the sequential and not limit the computers. We must state definitions and provide for priorities and descriptions of data. We must state relationships, not procedures.";
        int dataCounter = 0;

        //

        for (char i = 0; i <= quote.length() -1; i++){
            System.out.println(quote.charAt(i));
            if(quote.charAt(i) == 'd' && quote.charAt(i+1) == 'a' && quote.charAt(i+2) == 't' && quote.charAt(i+3) == 'a'){
                dataCounter += 1;
            }

        }
        System.out.println(dataCounter);
    }
}
