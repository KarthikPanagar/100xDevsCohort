/*
  Write a function `findLargestElement` that takes an array of numbers and returns the largest element.
  Example:
  - Input: [3, 7, 2, 9, 1]
  - Output: 9
*/

function findLargestElement(numbers) {
    let maxElement=numbers[0];

    // for(let number of numbers){
    //     if(number > maxElement)
    //         maxElement = number;
    // }
    //or
    numbers.forEach((number) => {
        if(number>maxElement){
          maxElement=number;
        }  
      })
    return maxElement;
}

module.exports = findLargestElement;