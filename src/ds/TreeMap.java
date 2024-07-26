package ds;


class TreeNode<K extends Comparable<K>, V> {
    K key;
    V value;
    TreeNode<K, V> left, right;

    public TreeNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

}

public class TreeMap<K extends Comparable<K>, V> {

    private TreeNode<K, V> root;

    public void put(K key, V value) {
        if (root == null) {
            root = new TreeNode<>(key, value);
            return;
        }
        TreeNode<K, V> current = root;
        while (true) {
            int cmp = key.compareTo(current.key);
            if (cmp < 0) {
                if (current.left == null) {
                    current.left = new TreeNode<>(key, value);
                    return;
                }
                current = current.left;
            } else if (cmp > 0) {
                if (current.right == null) {
                    current.right = new TreeNode<>(key, value);
                    return;
                }
                current = current.right;
            } else {
                current.value = value;
                return;
            }
        }
    }

    public V get(K key) {
        TreeNode<K, V> current = root;
        while (current != null) {
            int cmp = key.compareTo(current.key);
            if (cmp < 0)
                current = current.left;
            else if (cmp > 0)
                current = current.right;
            else
                return current.value;
        }
        return null;
    }

    public void remove(K key) {
        root = remove(root, key);
        System.out.println(root.value);
    }

    private TreeNode<K, V> remove(TreeNode<K, V> node, K key) {
        if (node == null)
            return null;

        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.left = remove(node.left, key);
        } else if (cmp > 0) {
            node.right = remove(node.right, key);
        } else {
            // Node with only one child or no child
            if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;

            // Node with two children: Get the inorder successor (smallest
            // in the right subtree)
            node.key = minValueKey(node.right);
            node.value = getValue(node.right, node.key);
            node.right = remove(node.right, node.key);
        }

        return node;
    }

    private K minValueKey(TreeNode<K, V> node) {
        while (node.left != null) {
            node = node.left;
        }
        return node.key;
    }

    private V getValue(TreeNode<K, V> node, K key) {
        while (node != null) {
            int cmp = key.compareTo(node.key);
            if (cmp < 0)
                node = node.left;
            else if (cmp > 0)
                node = node.right;
            else
                return node.value;
        }
        return null;
    }

    public void printTree() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(TreeNode<K, V> node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println("(" + node.key + ": " + node.value + ")");
            inOrderTraversal(node.right);
        }
    }


}

class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "10");
        treeMap.put(5, "5");
        treeMap.put(15, "15");
        treeMap.put(3, "3");
        treeMap.put(8, "8");
        treeMap.put(12, "12");
        treeMap.put(18, "18");
        treeMap.put(19, "19");
        treeMap.put(30, "30");
        treeMap.put(25, "25");
        treeMap.put(35, "35");
        treeMap.put(32, "32");
        treeMap.put(40, "40");

        treeMap.remove(18);

        System.out.println("Tree structure after removal:");
        treeMap.printTree();
    }

}
