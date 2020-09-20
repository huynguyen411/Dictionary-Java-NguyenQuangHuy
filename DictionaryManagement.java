import java.util.Scanner;

public class DictionaryManagement extends DictionaryCommandline{
    public Dictionary dictionary;
    public void insertFromCommandline() {
        Scanner sc = new Scanner(System.in);

        String wordTarget = "";
        String wordExplain = "";
        String _numberOfWord;
        int numberOfWord;

        _numberOfWord = sc.nextLine();
        numberOfWord = Integer.parseInt(_numberOfWord);

        dictionary = new Dictionary(numberOfWord);
        dictionary.setNumberOfWord(numberOfWord);

        for (int i = 0; i < numberOfWord; i++) {
            Word word = new Word();
            wordTarget = sc.nextLine();
            wordExplain = sc.nextLine();
            word.setWord_target(wordTarget);
            word.setWord_explain(wordExplain);
            dictionary.dictionaryList[i] = word;
        }
    }

    @Override
    public void showAllWords() {
        System.out.println("No    | English     | Vietnamese");
        for (int i = 0; i < dictionary.getNumberOfWord(); i++) {
            System.out.println(i + "      | " + dictionary.dictionaryList[i].getWord_target()
                    + "          | " + dictionary.dictionaryList[i].getWord_explain());
        }
    }
    @Override
    public void dictionaryBasic(){
        insertFromCommandline();
        showAllWords();
    }
}
