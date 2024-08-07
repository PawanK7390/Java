public class flipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int m = image[0].length;

        for (int[] row : image) {
            for (int i = 0; i < (m + 1) / 2; i++) {
                // Swap and invert in one step
                int temp = row[i] ^ 1;
                row[i] = row[m - i - 1] ^ 1;
                row[m - i - 1] = temp;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        flipAndInvertImage solution = new flipAndInvertImage();

        // Example input
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        // Output before flipping and inverting
        System.out.println("Before:");
        printImage(image);

        // Flip and invert the image
        int[][] flippedAndInvertedImage = solution.flipAndInvertImage(image);

        // Output after flipping and inverting
        System.out.println("After:");
        printImage(flippedAndInvertedImage);
    }

    private static void printImage(int[][] image) {
        for (int[] row : image) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}

/*

        Outer Loop:
        The outer for loop iterates over each row in the image.

        Inner Loop:
        The inner for loop iterates from 0 to the middle of the row (inclusive if the row has an odd number of elements).
        This is to ensure that we are swapping elements from both ends towards the center.
        (image[0].length + 1) / 2 ensures that the middle element is processed in case of odd-length rows.

        Swapping and Inverting:
        The ^ operator is the bitwise XOR. x ^ 1 will flip the bit x (0 to 1, or 1 to 0).
        temp stores the flipped value of row[i].
        row[i] is then set to the flipped value of the element at the symmetrical position from the end of the row.
        row[image[0].length - i - 1] is set to temp, effectively swapping and inverting both elements.
*/
