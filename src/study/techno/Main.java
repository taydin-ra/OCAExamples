package study.techno;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[][] arr = {{"a", "b", "c"}, {"d", "e"}};

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.println(arr[i][j] + "");

                if (arr[i][j].equals("b")) {
                    continue;
                }
            }
            break;
        }
    }
}