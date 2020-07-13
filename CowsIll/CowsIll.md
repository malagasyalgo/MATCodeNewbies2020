__Cows Ill__

*[Easy]: Arrays, Matrix, State Machine*
 
It's very unfortunate for Rajao, because Coronavirus now attacks cows as well. When a cow is sick, it cannot produce milk for **3 days** *from the day it got the virus.*
 
Given the amount of milk each of Rajao's cows produce in one day, and the days at which some of his cows contracted the virus and got sick. What is the amount of milk Rajao will get in the end?
 
__Input__

`cow`: An array of integers where `cow[i]` is the amount of milk the `i`-th produces in one day. 
`sickDay`: A matrix of integers where `sickDay[d]` contains the list of the indexes of the cows that contracted the virus on day `d`
 
__Output__

The total amount of milk Rajao will get at the end of the pandemic
 
__Example__
- For `cow = [2,3,1]` and 
  ```
  sickDay = [
   [],
   [0],
   [1, 2],
   [],
   []
  ]
  ```
  the answer should be `12`, here is how:
  - on day 1, no cows got sick, so every cow produces milk => 2 + 3 + 1 = 6 liters of milk so far
  - on day 2, cow[0] contracted the virus, so it will be unable to produce milk for the next 3 days (including today) => 0 + 3 + 1 = 4 liters for today, +6 of yesterday which gives 10 liters so far
  - on day 3, cow[1] and cow[2] got sick as well, so they will not produce milk for the next 3 days including today => Rajao will not get any milk for today then, still 10 liters so far
  - on day 4, it's the third day of sickness of cow[0], and second day of sickness for cow[1] and cow[2], cow[0] will recover tomorrow => Rajao has still 10 liters of milk so far
  - on day 5, it's the third day of sickness of cow[1] and cow[2], so they will still not produce milk. However, cow[0] has fully recovered, and is able to produce milk again => so milk so far = 10 liters from the beginning + 2 liters from cow[0] today, which makes 12 liters in total.
