import java.util.ArrayList;

public class WordChecker {
    private ArrayList<String> wordList;

    public WordChecker(ArrayList<String> wordList) {
        this.wordList = wordList;
    }


    public boolean isWordChain() {
        for(int i=0; i< wordList.size()-1; i++) {
            if(wordList.get(i+1).indexOf(wordList.get(i)) == -1) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<String> creatList(String target) {
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<wordList.size();i++){
            String word = wordList.get(i);
            int index = word.indexOf(target);
            if(index>=0) {
                String str = word.substring(index+target.length());
                if(word.equals(target)) {
                    list.add("");
                } else if(!str.equals("")) {
                    list.add(str);
                }
            }
        }
        return list;
    }


}
