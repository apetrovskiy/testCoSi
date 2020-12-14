# require 'test/unit'
require 'test/unit/assertions'
include Test::Unit::Assertions
require 'test/unit/ui/console/testrunner'
require_relative '../../../../main/java/test_lea_0003/a01_evenDigitsNumber/solution.rb'


# https://dev.to/exampro/testunit-writing-test-code-in-ruby-part-1-of-3-44m2
class EvenDigitsNumberTest
    assert_equal 3, evenDigitsNumber([12, 134, 111, 1111, 10])
end
