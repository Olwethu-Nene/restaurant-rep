public class RoomEntity {
    private String roomID;
    private Integer roomNumber;
    private String roomType;
    private String roomStatus;
    private Integer floorNumber;
    private String floorName;

    public RoomEntity(String roomID, Integer roomNumber, String roomType, String roomStatus,
                      Integer floorNumber, String floorName) {
        this.roomID = roomID;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomStatus = roomStatus;
        this.floorNumber = floorNumber;
        this.floorName = floorName;
    }

    public static class Builder {
        private String roomID;
        private Integer roomNumber;
        private String roomType;
        private String roomStatus;
        private Integer floorNumber;
        private String floorName;


        public String getRoomID() {
            return roomID;
        }

        public Builder setRoomID(String roomID) {
            this.roomID = roomID;
            return this;
        }

        public Integer getRoomNumber() {
            return roomNumber;
        }

        public Builder setRoomNumber(Integer roomNumber) {
            this.roomNumber = roomNumber;
            return this;
        }

        public String getRoomType() {
            return roomType;
        }

        public Builder setRoomType(String roomType) {
            this.roomType = roomType;
            return this;
        }

        public String getRoomStatus() {
            return roomStatus;
        }

        public Builder setRoomStatus(String roomStatus) {
            this.roomStatus = roomStatus;
            return this;
        }

        public Integer getFloorNumber() {
            return floorNumber;
        }

        public Builder setFloorNumber(Integer floorNumber) {
            this.floorNumber = floorNumber;
            return this;
        }

        public String getFloorName() {
            return floorName;
        }

        public Builder setFloorName(String floorName) {
            this.floorName = floorName;
            return this;
        }

        @Override
        public String toString() {
            return "RoomEntity{" +
                    "roomID='" + roomID + '\'' +
                    ", roomNumber=" + roomNumber +
                    ", roomType='" + roomType + '\'' +
                    ", roomStatus='" + roomStatus + '\'' +
                    ", floorNumber=" + floorNumber +
                    ", floorName='" + floorName + '\'' +
                    '}';
        }
    }
}
