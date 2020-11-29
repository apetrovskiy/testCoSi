class FancyRideTest(TestCase):
    def test_fancy_ride(self):
        self.assertEquals("UberXL", fancyRide(30, [0.3, 0.5, 0.7, 1, 1.3]))
