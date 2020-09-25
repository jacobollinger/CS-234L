class Lect09252020 {
    static int count(String word, LinkedList<String> list) {
        int c = 0;
        for (LinkedList<T>.Node x = list.start; x != null; x = x.next) {
            if (x.value.equals(word)) {
                c++;
            }
        }
        return c;
    }

    static int count(String word1, String word2, LinkedList<T> list) {
        int c = 0;
        for (LinkedList<T>.Node x = list.start; x != null && x.next != null; x = x.next) {
            if (x.value.equals(word1) && x.next.value.equals(word2)) {
                c++;
            }
        }
    }
    
    static void insertBefore(String word1, String word2, LinkedList<T> list) {
        for (LinkedList<T>.Node x = list.start; x != null; x = x.next) {
            if (x.value.equals(word2)) {
                list.insert(word1, x);
            }
        }
    }

    static void insertAfter(String word1, String word2, LinkedList<T> list) {
        for (LinkedList<T>.Node x = list.start; x != null; x = x.next) {
            if (x.value.equals(word2)) {
                if(x == list.end) {
                    list.append(word1);
                } else {
                list.insert(word1, x.next);
                }
            }
        }
    }
}
