Buckets are limited in many aspects. first, buckets are tied to their names and Region. Second, names must be unique over partition, i.e. entity happening even rarer than a Region. There's also a limitation on number of buckets per account, though increasible, but only to some extent.
Names their selves are limited by syntax and logic, what means that names should by 'saying' and be shaped in form of readable strings up to 63 characters long.

On the other hand, number of items in a bucket is near endless.
Then we need not to split customers' data into buckets, but use signle bucket per Region and divide customers' data by creating separate folders.
