import heapq
class Solution:
    def meetingRooms(self, arr):
        #sort by start time 
        arr.sort(key=lambda x:x[0])
        
        #min heap stores end value for earliest ending 
        #=> earlist end <=current start-> reuse room => heappop
        
        heap = []
        
        
        for start,end in arr:
            #if heap empty => heap[0] => error
            
            if heap and heap[0]<=start:
                #reuse
                heapq.heappop(heap)
            
            # occupy room till current end    
            heapq.heappush(heap,end)
        
        return len(heap)
        