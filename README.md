# Random Sentences Generator By Svetlin Stoychev

This Java program generates random sentences by combining words from different arrays. Each sentence consists of a random name, a random place, a random verb, a random noun, a random adverb, and a random detail.

## Prerequisites

Make sure you have the following installed:

- Java Development Kit (JDK)
- Integrated Development Environment (IDE) or a text editor

## Getting Started

1. Clone the repository or download the Java file.
2. Open the Java file in your preferred IDE or text editor.

## Usage

1. Run the program.
2. The program will display a prompt to generate a random sentence.
3. Press Enter to generate the first sentence.
4. After each sentence is displayed, press Enter to generate a new random sentence.
5. To stop generating sentences, terminate the program.

## Code Explanation

The program uses the `java.util.Random` and `java.util.Scanner` classes to generate random sentences based on predefined arrays of names, places, verbs, nouns, adverbs, and details.

1. The `main` method sets up the necessary variables and arrays.
2. It prompts the user to generate a random sentence.
3. It uses a `while` loop to continuously generate sentences until the user terminates the program.
4. Inside the loop, it calls the `getRandomWord` method to get a random word from the specified array.
5. It prints the sentence with the randomly chosen words.
6. It prompts the user to generate a new random sentence.

## License

This project is licensed under the [MIT License](LICENSE).
