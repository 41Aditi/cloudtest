var arr = [5, 3, 8, 1, 2, 0, 4];

arr.sort(function(a, b) {
  return b - a;
});

console.log("Sorted Array in Descending Order: " + arr);