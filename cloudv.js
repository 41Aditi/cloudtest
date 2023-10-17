var input = "This is a sunny day";

var reverse = reverseWord(input,"");

var ans = reverseWord(reverse," ");
console.log(ans);

function reverseWord(input,separator)
{
  return input.split(separator).reverse().join(separator);
}