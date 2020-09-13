There is a map with several geographical objects on it. Each object is represented by its coordinates and some additional info about it. All objects' coordinates are integers on a 2D plane.

To obtain information about objects, you are given an API endpoint. You can provide two pairs of coordinates (x1, y1) and (x2, y2) and get information about all the objects within the rectangle with a top-leftmost point (x1, y1) and a bottom-rightmost point (x2, y2). In other words, this endpoint will return information about objects with coordinates (x, y) such that x1 ≤ x ≤ x2 and y1 ≤ y ≤ y2.

example

However, the given API endpoint has a finite capacity: the traffic is very slow and it cannot return more than K objects in one response. If the number of objects that need to be returned is greater than K, the API endpoint returns an error: a JSON object in the following format:

{
  "message": "Error: too many objects to return"
}
Otherwise, in case the number of objects to return is less than or equal to K, the endpoint returns the list of objects in the requested area in the following format:

[
  {
    "x": <int>,
    "y": <int>,
    "type": <string>,
    "name": <string>,
    ...
  },
  ...
]
The possible object types are: "city", "street", and "building". Note that each object can have some additional fields, not listed in the format above. For example, every object of type "city" will have an "area" property.

Your task is to find the largest city on the map, i.e. find the object name with type equal to "city" which has the maximum "area" value. If there are several cities with the same area, return the city whose name would appear first in lexicographical order. Print the name of the found city to the standard output. If there are no cities in the selected area of the map, print No cities. to the standard output.

API endpoints

You can make 3 types of requests:

To get the maximal count of objects in the response (the number K), make a GET request to
/maxResponsePatchSize
As a response, you will receive the following JSON object:

{
  "K": <int>
}
To receive the borders of the map x_min, x_max, y_min, and y_max, make a GET request to
/borders
As a response, you will receive the following JSON object:

{
  "x_min": <int>,
  "x_max": <int>,
  "y_min": <int>,
  "y_max": <int>
}
To get information about the objects within a rectangular area, make a GET request to
/map?x_from=<x1>&y_from=<y1>&x_to=<x2>&y_to=<y2>
As a response, you will receive the following JSON object:

Error case (too many objects to return, invalid coordinates, etc.)

 {
   "message": "Error: Too many objects to return"
 }
or

{
  "message": "Error: Invalid input"
}
Normal case

[
  {
    "x": <int>,
    "y": <int>,
    "type": <string>,
    "name": <string>,
    ...
  },
  ...
]
A request to any other endpoint not present in the above list will give the following response:

{
  "message": "Error"
}
API credentials
API endpoint for max count of objects in response: http://localhost/maxResponsePatchSize;
API endpoint for map borders: http://localhost/borders;
API endpoint for the information about objects in sub-map represented by rectangle: http://localhost/map;
to query the objects, use the following url: http://localhost/map?x_from=<x1>&y_from=<y1>&x_to=<x2>&y_to=<y2>
Note: if you are solving this task in JavaScript use the request module for HTTP calls.

Example

Imagine the following responses from API endpoints:

For request http://localhost/maxResponsePatchSize the response is

{
  "K": 4
}
For request http://localhost/borders the response is

{
  "x_min": -2,
  "x_max": 10,
  "y_min": -5,
  "y_max": 15
}
For request http://localhost/map?x_from=-2&y_from=-5&x_to=10&y_to=15 the response is

{
  [
    {
      "x": 10,
      "y": 10,
      "type": "street",
      "name": "Street_1",
      "length": 10,
      "is_busy": true
    },
    {
      "x": 0,
      "y": 0,
      "type": "city",
      "name": "City_1",
      "area": 1000
    },
    {
      "x": -1,
      "y": 10,
      "type": "city",
      "name": "City_2",
      "area": 400
    },
    {
      "x": -2,
      "y": 4,
      "type": "building",
      "name": "Building_1"
    }
  ]
}
Then, City_1 should be printed to the standard output stream (since it has a larger area than City_2).

[execution time limit] 10 seconds (java)