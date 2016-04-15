Hamza Masud
BS(CS)-3A
Reg#4582

INTRODUCTION:
This lab deals with the classic problem of making denominations in coins given a certain amount. The goal is to have equivalent amount of money with the least possible number of coins. There are 2 approaches; one is the naive approach with greedy algorithms and the other is a more complicated dynamic programming approach.

APPROACH:
For greedy, I simply ran a loop until the whole amount turns to coins. I start from the opposite and just check if the denomination at hand can fit. Although it can find the denominations, it's not required. So it simply returns the number of coins. The denomination part is commented out. For the dynamic approach, I just translated what everyone on the internet was saying. There weren't much different approaches done. Everyone just translated a common pseudocode into a language, so I did that as well.

Unit tests run fine.

RESULT:
With these denominations, there wasn't even ONE case where the dynamic approach gave a better result than the greedy approach. Dynamic is usually always optimal, but with the given denominations, both are same, but dynamic just requires more resources.