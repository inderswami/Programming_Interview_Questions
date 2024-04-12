public class Replace_Third_Occurence_word {
        public static void main(String[] args) {
            String str = "goodmorninggoodafternoongoodnight";
            String replaceStr = "bad";
            String searchStr = "good";
            int occurrenceCount = 0;
            int index = -1;

            // Finding the index of the third occurrence of "good"
            for (int i = 0; i < str.length(); i++) {
                if (str.indexOf(searchStr, i) == i) {
                    occurrenceCount++;
                    if (occurrenceCount == 3) {
                        index = i;
                        break;
                    }
                }
            }

            // Replacing the third occurrence if found
            if (index != -1) {
                String newStr = str.substring(0, index) + replaceStr + str.substring(index + searchStr.length());
                System.out.println("Original String: " + str);
                System.out.println("Modified String: " + newStr);
            } else {
                System.out.println("Third occurrence of 'good' not found.");
            }
        }
    }






