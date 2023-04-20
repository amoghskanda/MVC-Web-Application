function toggleDropdown() {
    var dropdownContent = document.getElementById("dropdown-content");
    if (dropdownContent.style.display === "block") {
      dropdownContent.style.display = "none";
    } else {
      dropdownContent.style.display = "block";
    }
  }
  
  var dropdownOptions = document.querySelectorAll("#dropdown-content a");
  dropdownOptions.forEach(function(option) {
    option.addEventListener("click", function() {
      localStorage.setItem("selectedOption", this.innerHTML);
    });
  });
  
  // To retrieve saved data
  var savedOption = localStorage.getItem("selectedOption");
  console.log(savedOption);
  