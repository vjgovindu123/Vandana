

function reverseWordsInSentence(sentence) {
    // Split the sentence into words
    const words = sentence.split(' ');

    // Reverse each word and store them in an array
    const reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });

    // Join the reversed words back into a sentence
    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

const inputSentence = "This is a sunny day"; // Replace with your input sentence
const reversedResult = reverseWordsInSentence(inputSentence);
console.log(reversedResult);
