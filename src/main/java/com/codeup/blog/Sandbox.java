package com.codeup.blog;

public class Sandbox {
    static boolean search(int[] array, int number) {
        boolean found = false;
        for (int i = 0; i< array.length; i++) {
            if (array[i] == number) return true;
        }
        return found;
    }

    static boolean search(String[] array, String searchTerm) {
        boolean found = false;
        for (int i = 0; i< array.length; i++) {
            if (array[i].equalsIgnoreCase( searchTerm)) return true;
        }
        return found;
    }

    public static void main(String[] args) {
//        int[] nums = {126,4,21,12,100008,333,-42,10,007};
//        int lookingFor = -42;
//        System.out.println(search(nums,lookingFor));

//        String[] petNames = {"Brisket", "Faso", "Brody", "Pikachu", "Colt the Spitz", "Paco", "Gandalf"};
//        String lostPet = "paco";
//        System.out.println(search(petNames, lostPet));


    }
}
