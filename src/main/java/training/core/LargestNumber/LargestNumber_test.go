package LargestNumber

import (
	"log"
	"os"
	"testing"

	"github.com/dailymotion/allure-go"
	"github.com/joho/godotenv"
	. "github.com/onsi/ginkgo"
	. "github.com/onsi/gomega"
)

// https://towardsdatascience.com/use-environment-variable-in-your-next-golang-project-39e17c3aaa66
// use godot package to load/read the .env file and
// return the value of the key
func goDotEnvVariable(key string) string {

	// load .env file
	err := godotenv.Load("../../../../../../variables.env")

	if err != nil {
		log.Fatalf("Error loading .env file")
	}

	return os.Getenv(key)
}

func dotest(n int, exp int) {
	var ans = largestNumber(n)
	Expect(ans).To(Equal(exp))
}

var _ = Describe("Tests Largest Number", func() {

	It("should handle basic cases", func() {
		dotest(1, 9)
		dotest(2, 99)
		dotest(3, 999)
		dotest(9, 999999999)

	})
})

func TestSteplargestNumber(t *testing.T) {
	goDotEnvVariable("ALLURE_RESULTS_PATH")
	allure.Test(t, allure.Action(func() {
		Expect(largestNumber(1)).To(Equal(9))
		Expect(largestNumber(2)).To(Equal(99))
		Expect(largestNumber(3)).To(Equal(999))
		Expect(largestNumber(9)).To(Equal(999999999))
	}))
}
