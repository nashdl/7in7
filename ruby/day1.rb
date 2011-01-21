i = rand 10
i = i + 1
puts "pick a random number from 1 to 10"
u = gets
if u.to_i > i
  puts "That's too high you moron, should have guessed #{i}"
elsif u.to_i < i
  puts "The glass is half full, should have guessed #{i}"
end
