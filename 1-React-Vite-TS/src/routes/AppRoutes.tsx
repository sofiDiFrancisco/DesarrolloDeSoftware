import{ Routes, Route }from "react-router-dom"
import HomePage from "../pages/HomePage"
import Componentes from "../pages/Componentes"
import Administración from "../pages/Administración"

const AppRoutes: React.FC = () => {
  return (
    <Routes>
        <Route path="/" element={<HomePage/>} />
        <Route path="/componentes" element={<Componentes/>} />
        <Route path="/administración" element={<Administración/>} />
    </Routes>
  )
}

export default AppRoutes