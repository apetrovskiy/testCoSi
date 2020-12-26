Based on out ITD #1, i.e. use of a single bucket per Region with subfolders for customers, we then have a number of URLs formed by combining the bucket URL and path to customer's folder.

As can be seen (URL: https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-choosing-signed-urls-cookies.html) signed URLs are best choice for individual files, what is not our customers need. Customers own a number of files.
Instead, signed cookies offer support for groups of files, combined by file attributes (out of interest in the current ITD) or location. The second item is clearly mentioned in the above URL: "all of the files in the subscribers' area of website."
This is exactly our case, customers' data situated in customers' folders in a bucket.
