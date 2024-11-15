# Advent of Code Puzzle: Rucksack Reorganization

## Problem Description

---

### Part 1

One Elf has the important job of loading all of the rucksacks with supplies for the jungle journey. Unfortunately, that Elf didn’t quite follow the packing instructions, and so a few items now need to be rearranged.

Each rucksack has two large compartments. All items of a given type are meant to go into exactly one of the two compartments. The Elf that did the packing failed to follow this rule for exactly one item type per rucksack.

The Elves have made a list of all the items currently in each rucksack (your puzzle input), but they need your help finding the errors. Every item type is identified by a single lowercase or uppercase letter (that is, `a` and `A` refer to different types of items).

The list of items for each rucksack is given as characters all on a single line. A given rucksack always has the same number of items in each of its two compartments, so the first half of the characters represent items in the first compartment, while the second half of the characters represent items in the second compartment.

#### Example:

Suppose you have the following list of contents from six rucksacks:

vJrwpWtwJgWrhcsFMMfFFhFp

jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL

PmmdzqPrVvPwwTWBwg

wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn

ttgJtRGJQctTZtZT

CrZsJsPPZsGzwwsLwLmpwMDw

- The first rucksack contains the items `vJrwpWtwJgWrhcsFMMfFFhFp`, which means:
  - First compartment: `vJrwpWtwJgWr`
  - Second compartment: `hcsFMMfFFhFp`
  - The only item type that appears in both compartments is `p`.

- The second rucksack’s compartments contain:
  - `jqHRNqRjqzjGDLGL` and `rsFMfFZSrLrFZsSL`
  - The common item is `L`.

- Similarly, for the other rucksacks:
  - Third rucksack: Common item `P`
  - Fourth rucksack: Common item `v`
  - Fifth rucksack: Common item `t`
  - Sixth rucksack: Common item `s`

#### Priorities:

To help prioritize item rearrangement, every item type can be converted to a priority:
- Lowercase `a` to `z` have priorities `1` through `26`.
- Uppercase `A` to `Z` have priorities `27` through `52`.

#### Example:

The priorities of the misplaced items are:
- `16 (p)`, `38 (L)`, `42 (P)`, `22 (v)`, `20 (t)`, and `19 (s)`.
- The sum of these priorities is **157**.

---

### Part 2

After identifying the misplaced items, the Elves encountered another issue. For safety, the Elves are divided into groups of three. Each Elf carries a badge that identifies their group. For efficiency, within each group of three Elves, the badge is the only item type carried by all three Elves.

---

#### The problem is:

- Someone forgot to put this year’s updated authenticity sticker on the badges.
- All badges must be identified and pulled out for the stickers to be attached.

---

#### Solution:

Each group’s badge can be identified as the only item type common across the three Elves’ rucksacks.

#### Example:

Consider the first group of three Elves:

vJrwpWtwJgWrhcsFMMfFFhFp

jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL

PmmdzqPrVvPwwTWBwg

- The common badge item is `r`.

For the second group:

wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn

ttgJtRGJQctTZtZT

CrZsJsPPZsGzwwsLwLmpwMDw

- The common badge item is `Z`.

#### Priorities:

- The priority for `r` is `18`, and for `Z` is `52`.
- The sum of these priorities is **70**.

---

## Input File

The input file `input.txt` contains the list of rucksacks, one per line. Each set of three lines corresponds to a group in Part 2.

---

## Example Output

**Part 1 Output:**

Sum of priorities = 157

**Part 2 Output:**

Sum of badge priorities = 70

