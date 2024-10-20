package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	public HashMap<String, String> fruitDictionary = new HashMap<String, String>();
	{
		fruitDictionary.put("apple", "りんご");
		fruitDictionary.put("peach", "桃");
		fruitDictionary.put("banana", "バナナ");
		fruitDictionary.put("lemon", "レモン");
		fruitDictionary.put("pear", "梨");
		fruitDictionary.put("kiwi", "キウィ");
		fruitDictionary.put("strawberry", "いちご");
		fruitDictionary.put("grape", "ぶどう");
		fruitDictionary.put("muscat", "マスカット");
		fruitDictionary.put("cherry", "さくらんぼ");
	}

	public void searchFruit(String[] wordsArray) {
		for (String word : wordsArray) {
			if (fruitDictionary.containsKey(word)) {
				System.out.println(word + "の意味は" + fruitDictionary.get(word));
			} else {
				System.out.println(word + "は辞書に存在しません");
			}
		}
	}

}