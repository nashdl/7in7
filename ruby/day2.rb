i = 1
a = []
while i <= 16 do
  a.push i
  i = i + 1
end

a.each do |e|
  n = a.index(e)
  if (n % 4) == 0
    printf("%d %d %d %d\n", a[n],a[n+1],a[n+2],a[n+3])
  end
end
