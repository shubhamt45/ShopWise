// import axios from "axios";

// export const fetchDashboardData = async () => {
//     return await axios.get(" http://localhost:8080/api/v1.0/dashboard", {headers: {'Authorization': `Bearer ${localStorage.getItem("token")}`}});
// }


// In Dashboard.js
export const fetchDashboardData = async () => {
  try {
    return await axios.get("http://localhost:8080/api/v1.0/dashboard", {
      headers: { 
        'Authorization': `Bearer ${localStorage.getItem("token")}`
      }
    });
  } catch (error) {
    console.error("Dashboard Error Details:", {
      status: error.response?.status,
      headers: error.response?.headers,
      data: error.response?.data
    });
    throw error;
  }
}
