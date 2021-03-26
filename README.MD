[TOC]



# General Algorithm

## Unique Prime Multiplication

### Intro

<img src="img/unique_prime_factorization.png" style="zoom:50%;" />

The **Fundamental Theorem of Arithmetic** states that every natural number greater than 1 can be written as a product of prime numbers.

In computing algorithm, it can be utilized to acquire the eigenvalue of a "string" regardless of the position of each "character". So, "abc" and "bca" could get the same eigenvalue via Unique Prime Multiplication.

### caveat

- the range of this eigenvalue might be larger than the max bound of the integer.

### example

| website  | No.                |
| -------- | ------------------ |
| LeetCode | 49. Group Anagrams |
|          |                    |
|          |                    |

# Specific for the questions

## Update the Range Along the Array

### Intro

Image you have a Character String and you need to find the longest substring within in without any redundant character.

<img src="img/dynamic_programming.png" style="zoom:50%;" />

- The blue arrow will traverse the entire `String` character by character.
- The red arrow will check the table and decide whether move forward or not, when the position of the nearest repeating character of the letter that the blue arrow points to is larger, than the red arrow will move forward.
- In this way the blue arrow always points to the end of the satisfied substring and the red arrow resides at the beginning.
- The table will be updated, recording the next position of the nearest repeating character of the letter that the blue arrow points to
- the max length of the substring will also be update following the movement of the blue arrow

### example

| website  | No.                                               |
| -------- | ------------------------------------------------- |
| LeetCode | 3. Longest Substring Without Repeating Characters |
|          |                                                   |



## Increasing Triplet Subsequence

### Intro

Given an integer array `nums`, return `true` *if there exists a triple of indices* `(i, j, k)` *such that* `i < j < k` *and* `nums[i] < nums[j] < nums[k]`. If no such indices exists, return `false`.

- The `j` is the crucial one, because when we find a value larger than `j` we actually get the point.
- So, we need to keep `j` to be as smaller as possible, in order to achieve it, try to update `j` regarding `i`. 

### example

| website  | No.                                 |
| -------- | ----------------------------------- |
| LeetCode | 334. Increasing Triplet Subsequence |

## Missing Ranges

### Intro

You are given an inclusive range [lower, upper] and a sorted unique integer array `nums`, where all elements are in the inclusive range.

A number x is considered missing if x is in the range [lower, upper] and x is not in `nums`.

Return the smallest sorted list of ranges that cover every missing number exactly. That is, no element of `nums` is in any of the ranges, and each missing number is in one of the ranges.

Each range [a,b] in the list should be output as:

```shell
"a->b" if a != b
"a" if a == b
```

- traverse the `nums`,

### example

| website  | No.                 |
| -------- | ------------------- |
| leetcode | 163. missing ranges |
|          |                     |
|          |                     |



## Find the intersection of two linked list

### Intro

- get to the same initial point of two linked list and move forward together.

### example

| website  | No.                                   |
| -------- | ------------------------------------- |
| leetcode | 160. Intersection of Two Linked Lists |
|          |                                       |

