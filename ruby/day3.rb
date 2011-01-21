module ActsAsCsv

  def self.included(base)
    base.extend ActsAsCsvClassMethods
  end

  module ActsAsCsvClassMethods
    def acts_as_csv
      include ActsAsCsvInstanceMethods
    end
  end

  module ActsAsCsvInstanceMethods
    def read
      
      @csv_contents = []
      
      filename = self.class.to_s.downcase + '.txt'
      
      file = File.new(filename)
      
      @headers = file.gets.chomp.split(', ')
      
      file.each do |row|
        @csv_contents << row.chomp.split(', ')
      end
      
    end

    attr_accessor :headers, :csv_contents
    
    def each
      
    end
    
    def initialize
      read
    end

  end

end

class RubyCsv
  include ActsAsCsv
  acts_as_csv
end

csv = RubyCsv.new
csv.each {|row| puts row.one}

