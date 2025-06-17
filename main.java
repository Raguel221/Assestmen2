public class main {
    public static void main(String[] args) {
        VirusTree tree = new VirusTree();

        tree.preorderTraversal();              // Menampilkan bentuk pohon
        System.out.println(tree.checkBST());   // true jika BST, false jika bukan
    }
}