require 'test/unit'
require 'test/unit/assertions'
include Test::Unit::Assertions
require 'test/unit/ui/console/testrunner'
require_relative '../../../../main/java/test_lea_0003/a02_divisorSubstrings/solution.rb'

# require 'test/unit'

# class SolutionTest < Test::Unit::TestCase
#     def test_

# require 'rspec'
# require 'rspec-parameterized'
require 'rspec-parameterized'

# Nested Array Style
describe "plus" do
  where(:input_data, :group_length, :expected_result) do
    [
      [120, 2, 2], [555, 1, 1], [5341, 2, 0]
    ]
  end

  with_them do
    it "should do additions" do
    #   expect(a + b).to eq answer
      expect(sum_of_divisors input_data, group_length).to eq expected_result
    end
  end

#   with_them do
#     # Can browse parameters via `params` method in with_them block
#     # Can browse all parameters via `all_params` method in with_them block
#     it "#{params[:a]} + #{params[:b]} == #{params[:answer]}" do
#       expect(a + b).to eq answer
#     end
#   end
end
