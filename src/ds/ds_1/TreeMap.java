package ds.ds_1;

public class TreeMap<K extends Comparable<K>, V> {
    TreeNode<K, V> root;

    public TreeMap() {
        this.root = null;
    }

    public static void main(String[] args) {
        TreeMap map = new TreeMap();
        map.add("1", 1);
        map.add("2", 2);
    }

    public void add(K key, V value) {
        root = insert(root, key, value);
    }

    TreeNode<K, V> insert(TreeNode<K, V> node, K key, V value) {
        if (node == null) {
            return new TreeNode(key, value);
        } else {
            int cmp = key.compareTo(node.key);
            if (cmp < 0)
                node.left = insert(node.left, key, value);
            else if (cmp > 0)
                node.right = insert(node.right, key, value);
            else
                node.value = value;
        }
        return node;
    }

    class TreeNode<K, V> {

        K key;
        V value;
        TreeNode left, right;

        public TreeNode(K key, V value) {
            this.key = key;
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
}