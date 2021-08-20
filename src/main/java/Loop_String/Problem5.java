package Loop_String;
//<html>
//<body>
//<div>
//<p>Transaction Successful</p>
//<p>Trnx ID: TXN5164870</p>
//</div>
//
//
//</body>
//</html>
//Extract only transaction ID from the HTML
public class Problem5 {
    public static void main(String[] args) {
        String html="<html>\n" +
                "<body>\n" +
                "<div>\n" +
                "<p>Transaction Successful</p>\n" +
                "<p>Trnx ID: TXN5164870</p>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "</body>\n" +
                "</html>";
        int pos=html.indexOf("TXN");
        //System.out.println(pos);
        String txnId=html.substring(pos,pos+10);
        System.out.println(txnId);
    }
}
