# Factorization

## 172. Factorial Trailing Zeros

- 首先得知道有 2 * 5 这个因式才能得出末尾有 0 的数

- 就可以把问题转换成：题目给定的 n！ 中有几个 2 * 5 末尾就有几个 0，而 2 是任何偶数都有的因子，所以只要考虑 n！ 中一共有多少个 5 就可以了

- 那么可以分这几种情况：

  - 首先是 5 的倍数，它们就包含至少一个因子 5，比如 5、10、15、20，这几个都是 5 的倍数且只包含一个因子 5
  - 除了 5、10、15、20，比如 25 = 5 * 5，包含两个因子 5，所以 25 的倍数 50、75 这些都包含了两个因子 5
  - 还有一个特殊点的数 125 = 5 * 5 * 5，包含了三个因子 5

- 现在就拿 125！ 来举例算出它的末尾有多少个 0

  - 先去掉 5 的倍数，125 / 5 = 25，首先得出 有 25 个数是 5 的倍数（这 25 个数包含了 5 的倍数，也说明包含着 25 的倍数，125 的倍数），那么第一轮运算可以得出提供因子 5 个数有至少 25 个
  - 然后去掉 25 的倍数，125 / 25 = 5，可以得出有 5 个数是 25 的倍数，由于第一轮算出的 5 的倍数的数包含了这 5 个数，所以这 5 个数每个数额外提供了 5 个因子 5
  - 最后计算 125 的倍数，125 / 125 = 1，同上 125 再额外提供一个因子 5
  - 最后可以算出三轮一共提供因子 5 的个数为 25 + 5 + 1 = 31

  From [Java小白](https://leetcode-cn.com/problems/factorial-trailing-zeroes/comments/)



# Exponentiation by squaring

## start

When we calculate in this way is time-consuming,
$$
a^n = a \times a \times a \times ... \times a
$$
The better way is to calculate in this way
$$
a^n = a^{\frac{n}{2}} \times a^{\frac{n}{2}}
$$

$$
a^{\frac{n}{2}} = a^{\frac{n}{4}} \times a^{\frac{n}{4}}
$$

We represent the exponent in a binary way.

## explanation

<img src="img/Exponentiation by squaring.jpg" style="zoom:50%;" />

## code

[Exponentiation by Squaring](..\..\java\src\Math\Exponentiation_by_Squaring.java)